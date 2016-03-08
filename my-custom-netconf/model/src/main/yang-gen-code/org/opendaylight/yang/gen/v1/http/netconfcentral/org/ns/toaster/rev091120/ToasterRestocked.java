package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * Indicates that the toaster has run of out bread.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;toaster&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/toaster.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * notification toasterRestocked {
 *     description
 *         "Indicates that the toaster has run of out bread.";
 *     leaf amountOfBread {
 *         type uint32;
 *     }
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;toaster/toasterRestocked&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterRestockedBuilder}.
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterRestockedBuilder
 *
 */
public interface ToasterRestocked
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterRestocked>,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/toaster","2009-11-20","toasterRestocked"));

    /**
     * Indicates the amount of bread that was re-stocked
     *
     */
    java.lang.Long getAmountOfBread();

}

