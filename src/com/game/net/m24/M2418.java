package com.game.net.m24;

import org.frkd.io.OutputByteArray;
import org.frkd.net.socket.protocol.BasicMessage;


/**
 * ��¼ָ��ID����,���سɹ���,��ʼ����Ϸ��Ϣ
 *
 */
public class M2418 extends BasicMessage{
	
	public int _flag;//�Ƿ��¼���ͻ���,�����Ϊ1,������0
	
	public M2418() {
	}
	
	public M2418(int _flag) {
		this._flag = _flag;
	}

	@Override
	public byte[] encode(byte[] data) {
		OutputByteArray dos = new OutputByteArray();
		dos.writeByte(0);
		dos.writeByte(this._flag);
		return super.encode(dos.toByteArray());
	}
}
