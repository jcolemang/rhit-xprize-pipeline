
/* First created by JCasGen Sun Oct 08 07:47:26 EDT 2017 */
package edu.rosehulman.aixprize.pipeline.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;

public class Memory extends Annotation {
	/**
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("hiding")
	public final static int typeIndexID = JCasRegistry.register(Memory.class);
	/**
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("hiding")
	public final static int type = typeIndexID;

	/**
	 * @generated
	 * @return index of the type
	 */
	@Override
	public int getTypeIndexID() {
		return typeIndexID;
	}

	/**
	 * Never called. Disable default constructor
	 *
	 * @generated
	 */
	protected Memory() {
		/* intentionally empty block */}

	/**
	 * Internal - constructor used by generator
	 *
	 * @generated
	 * @param addr
	 *            low level Feature Structure reference
	 * @param type
	 *            the type of this Feature Structure
	 */
	public Memory(int addr, TOP_Type type) {
		super(addr, type);
		readObject();
	}

	/**
	 * @generated
	 * @param jcas
	 *            JCas to which this Feature Structure belongs
	 */
	public Memory(JCas jcas) {
		super(jcas);
		readObject();
	}

	/**
	 * @generated
	 * @param jcas
	 *            JCas to which this Feature Structure belongs
	 * @param begin
	 *            offset to the begin spot in the SofA
	 * @param end
	 *            offset to the end spot in the SofA
	 */
	public Memory(JCas jcas, int begin, int end) {
		super(jcas);
		setBegin(begin);
		setEnd(end);
		readObject();
	}

	/**
	 * <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc
	 * -->
	 *
	 * @generated modifiable
	 */
	private void readObject() {
		/* default - does nothing empty block */}

	// *--------------*
	// * Feature: text

	/**
	 * getter for text - gets
	 * 
	 * @generated
	 * @return value of the feature
	 */
	public String getText() {
		if (Memory_Type.featOkTst && ((Memory_Type) jcasType).casFeat_text == null)
			jcasType.jcas.throwFeatMissing("namedBlocks", "edu.rosehulman.aixprize.pipeline.types.MemoryType");
		return jcasType.ll_cas.ll_getStringValue(addr, ((Memory_Type) jcasType).casFeatCode_text);
	}

	/**
	 * setter for text - sets
	 * 
	 * @generated
	 * @param v
	 *            value to set into the feature
	 */
	public void setText(String v) {
		if (Memory_Type.featOkTst && ((Memory_Type) jcasType).casFeat_text == null)
			jcasType.jcas.throwFeatMissing("namedBlocks", "edu.rosehulman.aixprize.pipeline.types.MemoryType");
		jcasType.ll_cas.ll_setStringValue(addr, ((Memory_Type) jcasType).casFeatCode_text, v);
	}
}
