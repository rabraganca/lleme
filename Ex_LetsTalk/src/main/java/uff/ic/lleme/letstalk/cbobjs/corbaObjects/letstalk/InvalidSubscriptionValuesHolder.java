package uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk;

/**
 * corbaObjects/letstalk/InvalidSubscriptionValuesHolder.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from letstalk.idl Sexta-feira,
 * 9 de Dezembro de 2005 18h26min29s BRST
 */

public final class InvalidSubscriptionValuesHolder implements
		org.omg.CORBA.portable.Streamable {
	public uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.InvalidSubscriptionValues value = null;

	public InvalidSubscriptionValuesHolder() {
	}

	public InvalidSubscriptionValuesHolder(
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.InvalidSubscriptionValues initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.InvalidSubscriptionValuesHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.InvalidSubscriptionValuesHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.InvalidSubscriptionValuesHelper.type();
	}

}
