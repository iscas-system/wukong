package io.github.wukong.azure_vm.models.virtualMachineRunCommands;

public class GetRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String location;

	protected java.lang.String commandId;

	public void setLocation(java.lang.String location) {
		this.location = location;
}
	public java.lang.String getLocation() {
		return this.location;
}
	public void setCommandId(java.lang.String commandId) {
		this.commandId = commandId;
}
	public java.lang.String getCommandId() {
		return this.commandId;
}
}