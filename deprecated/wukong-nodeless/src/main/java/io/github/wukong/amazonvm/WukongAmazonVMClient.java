/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.amazonvm;


import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.ec2.AmazonEC2Client;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
@SuppressWarnings("deprecation")
public class WukongAmazonVMClient extends AmazonEC2Client {

	public WukongAmazonVMClient() {
		super();
	}

	public WukongAmazonVMClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
		super(awsCredentials, clientConfiguration);
	}

	public WukongAmazonVMClient(AWSCredentials awsCredentials) {
		super(awsCredentials);
	}

	public WukongAmazonVMClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(awsCredentialsProvider, clientConfiguration, requestMetricCollector);
	}

	public WukongAmazonVMClient(AWSCredentialsProvider awsCredentialsProvider,
			ClientConfiguration clientConfiguration) {
		super(awsCredentialsProvider, clientConfiguration);
	}

	public WukongAmazonVMClient(AWSCredentialsProvider awsCredentialsProvider) {
		super(awsCredentialsProvider);
	}

	public WukongAmazonVMClient(ClientConfiguration clientConfiguration) {
		super(clientConfiguration);
	}

}
