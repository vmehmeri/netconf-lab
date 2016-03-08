#!/bin/bash
if [ $# -ne 1 ]
then
    echo "Usage: spawn_turing <device-name>"
    exit 0
fi

######## Spin up containers
DEVICE_NAME=$1
sudo docker rm -f $DEVICE_NAME
DOCKER_ID=`sudo docker run --name $DEVICE_NAME -dit sdnhub/netopeer /bin/bash`
#echo $DOCKER_ID
echo "Spawned container with IP `sudo docker inspect --format '{{ .NetworkSettings.IPAddress }}' $DEVICE_NAME`"

######## Start netconf server with custom YANG model
sudo docker cp base_datastore.xml ${DEVICE_NAME}:/usr/local/etc/netopeer/cfgnetopeer/datastore.xml
sudo docker cp turing-machine.yang ${DEVICE_NAME}:/root/turing-machine.yang
sudo docker exec $DEVICE_NAME pyang -f yin /root/turing-machine.yang -o /root/turing-machine.yin
sudo docker exec $DEVICE_NAME netopeer-manager add --name turing-machine --model turing-machine.yin --datastore /usr/local/etc/netopeer/cfgnetopeer/turing.xml
sudo docker exec $DEVICE_NAME netopeer-server -d
