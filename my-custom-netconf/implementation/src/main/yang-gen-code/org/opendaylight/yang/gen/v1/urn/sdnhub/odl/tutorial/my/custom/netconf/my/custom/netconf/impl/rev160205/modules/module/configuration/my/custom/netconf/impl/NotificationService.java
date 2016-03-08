package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration.my.custom.netconf.impl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;my-custom-netconf-impl&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/my-custom-netconf.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container notification-service {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:sdnhub:odl:tutorial:my-custom-netconf:my-custom-netconf-impl?revision=2016-02-05)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;my-custom-netconf-impl/modules/module/configuration/(urn:sdnhub:odl:tutorial:my-custom-netconf:my-custom-netconf-impl?revision=2016-02-05)my-custom-netconf-impl/notification-service&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration.my.custom.netconf.impl.NotificationServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration.my.custom.netconf.impl.NotificationServiceBuilder
 *
 */
public interface NotificationService
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.my.custom.netconf.my.custom.netconf.impl.rev160205.modules.module.configuration.my.custom.netconf.impl.NotificationService>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:odl:tutorial:my-custom-netconf:my-custom-netconf-impl","2016-02-05","notification-service"));


}

