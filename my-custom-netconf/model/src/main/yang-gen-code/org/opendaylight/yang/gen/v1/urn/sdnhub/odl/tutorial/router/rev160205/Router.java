package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.router.Ospf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.router.Bgp;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;router&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/router.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container router {
 *     list ospf {
 *         key "process-id"
 *         leaf process-id {
 *             type uint32;
 *         }
 *         list networks {
 *             key "subnet-ip"
 *             leaf subnet-ip {
 *                 type string;
 *             }
 *             leaf area-id {
 *                 type uint32;
 *             }
 *         }
 *     }
 *     list bgp {
 *         key "as-number"
 *         leaf as-number {
 *             type uint32;
 *         }
 *         leaf router-id {
 *             type string;
 *         }
 *         list neighbors {
 *             key "as-number"
 *             leaf as-number {
 *                 type uint32;
 *             }
 *             leaf peer-ip {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;router/router&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.RouterBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.RouterBuilder
 *
 */
public interface Router
    extends
    ChildOf<RouterData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.Router>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:odl:tutorial:router","2016-02-05","router"));

    List<Ospf> getOspf();
    
    List<Bgp> getBgp();

}

