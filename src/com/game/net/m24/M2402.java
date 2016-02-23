package com.game.net.m24;

import org.frkd.io.InputByteArray;
import org.frkd.io.OutputByteArray;
import org.frkd.net.socket.protocol.BasicMessage;


/**
 * NPC�Ի���
 * ��ȡ����Ѻ������_npcId:0x2F49��_type:0x1
 * ���޽�����_npcId:0x2B2C��_type:0x1
 * ˢ�����޵ȼ���_npcId:0x2F49��_type:0x2
 * ��ȡս��_npcId:0x2F49��_type:0x2E
 * ȥ��ڤ����_npcId��0x2EE1��_type��0x1A
 * ȥа����縱��,_npcId��0x2EED��_type��0x0425
 * 
 * ����50������,_npcId:0x2EEC,_type:0x044D
 * ����50���·�,_npcId:0x2EEC,_type:0x0457
 * ����60������,_npcId:0x2EEC,_type:0x0835
 * 
 * ȥ�����壬_npcId:0x2EE1,_type:0x0B
 *
 */
public class M2402 extends BasicMessage{
	
	public int result;
	public int _npcId;
	public int _type;

	@Override
	public void decode(byte[] data) {
		InputByteArray dis = new InputByteArray(data);
		dis.skipBytes(1);
		this.result = dis.readByte();
	}
	
	@Override
	public byte[] encode(byte[] data) {
		OutputByteArray dos = new OutputByteArray();
		dos.writeByte(0);
		dos.writeInt(this._npcId);
		dos.writeInt(this._type);
		return super.encode(dos.toByteArray());
	}

	@Override
	public String toString() {
		return "M2402{" +
				"result=" + result +
				", _npcId=" + _npcId +
				", _type=" + _type +
				'}';
	}
}
