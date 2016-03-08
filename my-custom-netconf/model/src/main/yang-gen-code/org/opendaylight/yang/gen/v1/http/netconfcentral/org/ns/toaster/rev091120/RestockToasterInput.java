package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;toaster&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/toaster.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container input {
 *     leaf amountOfBreadToStock {
 *         type uint32;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;toaster/restock-toaster/input&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInputBuilder
 *
 */
public interface RestockToasterInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster","2009-11-20","input"));

    /**
     * Indicates the amount of bread to re-stock
     *
     */
    java.lang.Long getAmountOfBreadToStock();

}

