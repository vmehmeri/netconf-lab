package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
 * Interface for receiving the following YANG notifications defined in module &lt;b&gt;toaster&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/toaster.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * notification toasterOutOfBread {
 *     description
 *         "Indicates that the toaster has run of out bread.";
 *     status CURRENT;
 * }
 * notification toasterRestocked {
 *     description
 *         "Indicates that the toaster has run of out bread.";
 *     leaf amountOfBread {
 *         type uint32;
 *     }
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 *
 */
public interface ToasterListener
    extends
    NotificationListener
{




    /**
     * Indicates that the toaster has run of out bread.
     *
     */
    void onToasterOutOfBread(ToasterOutOfBread notification);
    
    /**
     * Indicates that the toaster has run of out bread.
     *
     */
    void onToasterRestocked(ToasterRestocked notification);

}

