/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.docker;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.SyncDockerCmd;
import com.github.wukong.core.anas.ReqAndRespPatternAnalyzer;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class DockerKindAnalyzer extends ReqAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return DockerClient.class.getName();
	}

	@Override
	protected String getPostfix() {
		return "Cmd";
	}

	@Override
	protected String getSuperclass() {
		return SyncDockerCmd.class.getName();
	}
}
