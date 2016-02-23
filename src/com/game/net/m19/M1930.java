package com.game.net.m19;

import org.frkd.io.InputByteArray;
import org.frkd.net.socket.protocol.BasicMessage;

/**
 * onUpdateUserInfoHandler
 * 
 *
 */
public class M1930 extends BasicMessage {
	
	/**
	 * type=1ʱ��content����Ϊ���󶨽�Ҽ��� 50000
	 * type=10ʱ��content����Ϊ��ˢ�³ɹ�,��ǰ���޵ȼ�(����С��)
	 */
	public long type;
	
	public String content;

	public void decode(byte[] _arg1) {
		InputByteArray dis = new InputByteArray(_arg1);
		dis.skipBytes(1);

		this.type = dis.readByte();
        this.content = dis.readUTF();

	}

	@Override
	public String toString() {
		return "M1930 [type=" + type + ", content=" + content + "]";
	}
	
	

}
