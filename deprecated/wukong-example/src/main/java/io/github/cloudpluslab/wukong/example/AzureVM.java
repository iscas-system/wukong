package io.github.cloudpluslab.wukong.example;


import com.microsoft.azure.management.compute.implementation.ComputeManagementClientImpl;
import com.microsoft.azure.management.compute.implementation.ImageInner;
import com.microsoft.azure.management.compute.implementation.VirtualMachineInner;

/**
 * Hello world!
 *
 */
public class AzureVM 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	ComputeManagementClientImpl client = getClient();
    	{
    		client.virtualMachines().startAsync("USA", "vm001");
    		VirtualMachineInner parameters = new VirtualMachineInner();
			client.virtualMachines().createOrUpdateAsync("", "", parameters );
    	}
    	{
    		ImageInner parameters = new ImageInner();
    		parameters.withLocation("USA");
			client.images().beginCreateOrUpdateAsync("USA", "", parameters );
    	}
    }
    
	private static ComputeManagementClientImpl getClient() {
		return null;
	}
}
