package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration.my.custom.netconf.impl.RpcRegistry;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration.my.custom.netconf.impl.BindingAwareBroker;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration.my.custom.netconf.impl.DataBroker;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration.my.custom.netconf.impl.NotificationService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;my-custom-netconf-impl&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/my-custom-netconf.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * case my-custom-netconf-impl {
 *     container binding-aware-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:my-custom-netconf:my-custom-netconf-impl?revision=2016-02-05)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:my-custom-netconf:my-custom-netconf-impl?revision=2016-02-05)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container notification-service {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:my-custom-netconf:my-custom-netconf-impl?revision=2016-02-05)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container rpc-registry {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:my-custom-netconf:my-custom-netconf-impl?revision=2016-02-05)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;my-custom-netconf-impl/modules/module/configuration/(urn:sdnhub:odl:tutorial:my-custom-netconf:my-custom-netconf-impl?revision=2016-02-05)my-custom-netconf-impl&lt;/i&gt;
 *
 */
public interface MyCustomNetconfImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration.MyCustomNetconfImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:odl:tutorial:my-custom-netconf:my-custom-netconf-impl","2016-02-05","my-custom-netconf-impl"));

    BindingAwareBroker getBindingAwareBroker();
    
    DataBroker getDataBroker();
    
    NotificationService getNotificationService();
    
    RpcRegistry getRpcRegistry();

}

