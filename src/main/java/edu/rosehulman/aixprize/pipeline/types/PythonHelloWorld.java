
/* Apache UIMA v3 - First created by JCasGen Wed Dec 12 23:28:16 EST 2018 */

package edu.rosehulman.aixprize.pipeline.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;

public class PythonHelloWorld extends Annotation {

	/**
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("hiding")
	public final static String _TypeName = "edu.rosehulman.aixprize.pipeline.types.PythonHelloWorld";

	/**
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("hiding")
	public final static int typeIndexID = JCasRegistry.register(PythonHelloWorld.class);
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
	protected PythonHelloWorld() {
		/* intentionally empty block */}

	/**
	 * Internal - constructor used by generator
	 * 
	 * @generated
	 * @param casImpl
	 *            the CAS this Feature Structure belongs to
	 * @param type
	 *            the type of this Feature Structure
	 */
	public PythonHelloWorld(int addr, TOP_Type type) {
		super(addr, type);
		readObject();
	}

	/**
	 * @generated
	 * @param jcas
	 *            JCas to which this Feature Structure belongs
	 */
	public PythonHelloWorld(JCas jcas) {
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
	public PythonHelloWorld(JCas jcas, int begin, int end) {
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
		if (PythonHelloWorld_Type.featOkTst && ((PythonHelloWorld_Type) jcasType).casFeat_text == null)
			jcasType.jcas.throwFeatMissing("text", "edu.rosehulman.aixprize.pipeline.types.PythonHelloWorld");
		return jcasType.ll_cas.ll_getStringValue(addr, ((PythonHelloWorld_Type) jcasType).casFeatCode_text);
	}

	/**
	 * setter for text - sets
	 * 
	 * @generated
	 * @param v
	 *            value to set into the feature
	 */
	public void setText(String v) {
		if (PythonHelloWorld_Type.featOkTst && ((PythonHelloWorld_Type) jcasType).casFeat_text == null)
			jcasType.jcas.throwFeatMissing("text", "edu.rosehulman.aixprize.pipeline.types.PythonHelloWorld");
		jcasType.ll_cas.ll_setStringValue(addr, ((PythonHelloWorld_Type) jcasType).casFeatCode_text, v);
	}
}