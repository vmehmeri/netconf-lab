package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;router&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/router.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container input {
 *     leaf toasterDoneness {
 *         type uint32;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;router/make-toast/input&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.MakeToastInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.MakeToastInputBuilder
 *
 */
public interface MakeToastInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205.MakeToastInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:odl:tutorial:router","2016-02-05","input"));

    /**
     * This variable controls how well-done is the ensuing toast. It should be on a 
     * scale of 1 to 10. Toast made at 10 generally is considered unfit for human 
     * consumption; toast made at 1 is warmed lightly.
     *
     */
    java.lang.Long getToasterDoneness();

}

