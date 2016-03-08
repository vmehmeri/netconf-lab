package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;


/**
 * Interface for implementing the following YANG RPCs defined in module &lt;b&gt;toaster&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/toaster.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * rpc cancel-toast {
 *     "Stop making toast, if any is being made.
 *                    A 'resource-denied' error will be returned
 *                    if the toaster service is disabled.";
 *     status CURRENT;
 * }
 * rpc make-toast {
 *     "Make some toast.
 *                    The toastDone notification will be sent when
 *                    the toast is finished.
 *                    An 'in-use' error will be returned if toast
 *                    is already being made.
 *                    A 'resource-denied' error will be returned
 *                    if the toaster service is disabled.";
 *     input {
 *         leaf toasterDoneness {
 *             type uint32;
 *         }
 *         leaf toasterToastType {
 *             type identityref;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * rpc restock-toaster {
 *     "Restocks the toaster with the amount of bread specified.";
 *     input {
 *         leaf amountOfBreadToStock {
 *             type uint32;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 *
 */
public interface ToasterService
    extends
    RpcService
{




    /**
     * Stop making toast, if any is being made. A 'resource-denied' error will be 
     * returned if the toaster service is disabled.
     *
     */
    Future<RpcResult<java.lang.Void>> cancelToast();
    
    /**
     * Make some toast. The toastDone notification will be sent when the toast is 
     * finished. An 'in-use' error will be returned if toast is already being made. A 
     * 'resource-denied' error will be returned if the toaster service is disabled.
     *
     */
    Future<RpcResult<java.lang.Void>> makeToast(MakeToastInput input);
    
    /**
     * Restocks the toaster with the amount of bread specified.
     *
     */
    Future<RpcResult<java.lang.Void>> restockToaster(RestockToasterInput input);

}

