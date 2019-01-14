package com.github.wukong.azurevm.models.virtualMachineRunCommands;

public class GetRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
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