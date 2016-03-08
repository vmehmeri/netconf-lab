package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.router;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.Router;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.router.bgp.Neighbors;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;router&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/router.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * list bgp {
 *     key "as-number"
 *     leaf as-number {
 *         type uint32;
 *     }
 *     leaf router-id {
 *         type string;
 *     }
 *     list neighbors {
 *         key "as-number"
 *         leaf as-number {
 *             type uint32;
 *         }
 *         leaf peer-ip {
 *             type string;
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;router/router/bgp&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.router.BgpBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.router.BgpBuilder
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.router.BgpKey
 *
 */
public interface Bgp
    extends
    ChildOf<Router>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.router.Bgp>,
    Identifiable<BgpKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:odl:tutorial:router","2016-02-05","bgp"));

    java.lang.Long getAsNumber();
    
    java.lang.String getRouterId();
    
    List<Neighbors> getNeighbors();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    BgpKey getKey();

}

