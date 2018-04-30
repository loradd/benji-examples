/**
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.mdh.idt.benji.examples.refactorings.simplecore.Attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.DataType;
import se.mdh.idt.benji.examples.refactorings.simplecore.Reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecoreFactory;
import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplecoreFactoryImpl extends EFactoryImpl implements SimplecoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplecoreFactory init() {
		try {
			SimplecoreFactory theSimplecoreFactory = (SimplecoreFactory)EPackage.Registry.INSTANCE.getEFactory(SimplecorePackage.eNS_URI);
			if (theSimplecoreFactory != null) {
				return theSimplecoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplecoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplecoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimplecorePackage.PACKAGE: return createPackage();
			case SimplecorePackage.CLASS: return createClass();
			case SimplecorePackage.ATTRIBUTE: return createAttribute();
			case SimplecorePackage.REFERENCE: return createReference();
			case SimplecorePackage.DATA_TYPE: return createDataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public se.mdh.idt.benji.examples.refactorings.simplecore.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public se.mdh.idt.benji.examples.refactorings.simplecore.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplecorePackage getSimplecorePackage() {
		return (SimplecorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplecorePackage getPackage() {
		return SimplecorePackage.eINSTANCE;
	}

} //SimplecoreFactoryImpl
