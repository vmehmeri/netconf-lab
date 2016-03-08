import request
import json

data = {
        "toaster:toaster" :
   {
     "toaster:toasterManufacturer" : "General Electric",
     "toaster:toasterModelNumber" : "123",
     "toaster:toasterStatus" : "up"
    }
}

req = urllib2.Request('http://localhost:8080/restconf/config')
req.add_header('Content-Type', 'application/yang.data+json')

response = urllib2.urlopen(req, json.dumps(data))


print (response)
