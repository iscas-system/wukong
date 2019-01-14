package com.github.wukong.docker;

import com.github.dockerjava.core.DockerClientImpl;

public class DockerDemoTest {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		DockerClientImpl docker = null;
		docker.infoCmd().exec();
		docker.createContainerCmd(null).exec();
	}

}
