/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TBMDIRCTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getTBMDIRCTION()
 * @model
 * @generated
 */
public enum TBMDIRCTION implements Enumerator {
	/**
	 * The '<em><b>Const Donotchangethebaseline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DONOTCHANGETHEBASELINE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DONOTCHANGETHEBASELINE(0, "ConstDonotchangethebaseline", "ConstDonotchangethebaseline"),

	/**
	 * The '<em><b>Const Returntotheestablishedbaseline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RETURNTOTHEESTABLISHEDBASELINE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RETURNTOTHEESTABLISHEDBASELINE(1, "ConstReturntotheestablishedbaseline", "ConstReturntotheestablishedbaseline"),

	/**
	 * The '<em><b>Const Awayfromthe Iaxis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_AWAYFROMTHE_IAXIS_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_AWAYFROMTHE_IAXIS(2, "ConstAwayfromtheIaxis", "ConstAwayfromtheIaxis"),

	/**
	 * The '<em><b>Const Towardthe Iaxis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_TOWARDTHE_IAXIS_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_TOWARDTHE_IAXIS(3, "ConstTowardtheIaxis", "ConstTowardtheIaxis");

	/**
	 * The '<em><b>Const Donotchangethebaseline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Donotchangethebaseline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DONOTCHANGETHEBASELINE
	 * @model name="ConstDonotchangethebaseline"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DONOTCHANGETHEBASELINE_VALUE = 0;

	/**
	 * The '<em><b>Const Returntotheestablishedbaseline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Returntotheestablishedbaseline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_RETURNTOTHEESTABLISHEDBASELINE
	 * @model name="ConstReturntotheestablishedbaseline"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_RETURNTOTHEESTABLISHEDBASELINE_VALUE = 1;

	/**
	 * The '<em><b>Const Awayfromthe Iaxis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Awayfromthe Iaxis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_AWAYFROMTHE_IAXIS
	 * @model name="ConstAwayfromtheIaxis"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_AWAYFROMTHE_IAXIS_VALUE = 2;

	/**
	 * The '<em><b>Const Towardthe Iaxis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Towardthe Iaxis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_TOWARDTHE_IAXIS
	 * @model name="ConstTowardtheIaxis"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_TOWARDTHE_IAXIS_VALUE = 3;

	/**
	 * An array of all the '<em><b>TBMDIRCTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TBMDIRCTION[] VALUES_ARRAY =
		new TBMDIRCTION[] {
			CONST_DONOTCHANGETHEBASELINE,
			CONST_RETURNTOTHEESTABLISHEDBASELINE,
			CONST_AWAYFROMTHE_IAXIS,
			CONST_TOWARDTHE_IAXIS,
		};

	/**
	 * A public read-only list of all the '<em><b>TBMDIRCTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TBMDIRCTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TBMDIRCTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TBMDIRCTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TBMDIRCTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TBMDIRCTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TBMDIRCTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TBMDIRCTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TBMDIRCTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TBMDIRCTION get(int value) {
		switch (value) {
			case CONST_DONOTCHANGETHEBASELINE_VALUE: return CONST_DONOTCHANGETHEBASELINE;
			case CONST_RETURNTOTHEESTABLISHEDBASELINE_VALUE: return CONST_RETURNTOTHEESTABLISHEDBASELINE;
			case CONST_AWAYFROMTHE_IAXIS_VALUE: return CONST_AWAYFROMTHE_IAXIS;
			case CONST_TOWARDTHE_IAXIS_VALUE: return CONST_TOWARDTHE_IAXIS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TBMDIRCTION(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TBMDIRCTION
