package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.router.rev160205;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;


/**
 * Interface for implementing the following YANG RPCs defined in module &lt;b&gt;router&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/router.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * rpc cancel-toast {
 *     "Stop making toast, if any is being made.
 *               A 'resource-denied' error will be returned
 *               if the toaster service is disabled.";
 *     status CURRENT;
 * }
 * rpc make-toast {
 *     "Make some toast. The toastDone notification will be sent when the toast is finished.
 *             An 'in-use' error will be returned if toast is already being made. A 'resource-denied' error will
 *             be returned if the toaster service is disabled.";
 *     input {
 *         leaf toasterDoneness {
 *             type uint32;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 *
 */
public interface RouterService
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

}

