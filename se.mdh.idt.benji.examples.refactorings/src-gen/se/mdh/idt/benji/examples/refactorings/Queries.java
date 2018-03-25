/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.AddClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.AddClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddPackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePrecondition;
import se.mdh.idt.benji.examples.refactorings.ChangeClassAbstractPostcondition;
import se.mdh.idt.benji.examples.refactorings.ChangeClassAbstractPrecondition;
import se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition;
import se.mdh.idt.benji.examples.refactorings.DeleteAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.DeleteAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.DeleteClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.DeleteClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.DeleteReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition;
import se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition;
import se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition;
import se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition;
import se.mdh.idt.benji.examples.refactorings.MergeReferencesPrecondition;
import se.mdh.idt.benji.examples.refactorings.PushDownAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.RenameClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.RenamePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.RenamePackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.RenameURIPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.RestrictReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition;

/**
 * A pattern group formed of all public patterns defined in Queries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings, the group contains the definition of the following patterns: <ul>
 * <li>RenamePackagePrecondition</li>
 * <li>RenamePackagePostcondition</li>
 * <li>RenameURIPackagePrecondition</li>
 * <li>RenameURIPackagePostcondition</li>
 * <li>DeletePackagePrecondition</li>
 * <li>DeletePackagePostcondition</li>
 * <li>AddPackagePrecondition</li>
 * <li>AddPackagePostcondition</li>
 * <li>AddClassPrecondition</li>
 * <li>AddClassPostcondition</li>
 * <li>RenameClassPrecondition</li>
 * <li>RenameClassPostcondition</li>
 * <li>DeleteClassPrecondition</li>
 * <li>DeleteClassPostcondition</li>
 * <li>ExtractClassPrecondition</li>
 * <li>ExtractClassPostcondition</li>
 * <li>MergeClassesPrecondition</li>
 * <li>MergeClassesPostcondition</li>
 * <li>AddAttributePrecondition</li>
 * <li>AddAttributePostcondition</li>
 * <li>DeleteAttributePrecondition</li>
 * <li>DeleteAttributePostcondition</li>
 * <li>ChangeAttributeTypePrecondition</li>
 * <li>ChangeAttributeTypePostcondition</li>
 * <li>AddReferencePrecondition</li>
 * <li>AddReferencePostcondition</li>
 * <li>DeleteReferencePrecondition</li>
 * <li>DeleteReferencePostcondition</li>
 * <li>MergeReferencesPrecondition</li>
 * <li>MergeReferencesPostcondition</li>
 * <li>ChangeReferenceTypePrecondition</li>
 * <li>ChangeReferenceTypePostcondition</li>
 * <li>ExtractSuperclassPrecondition</li>
 * <li>ExtractSuperclassPostcondition</li>
 * <li>ChangeClassAbstractPrecondition</li>
 * <li>ChangeClassAbstractPostcondition</li>
 * <li>RestrictReferencePrecondition</li>
 * <li>RestrictReferencePostcondition</li>
 * <li>PushDownAttributePrecondition</li>
 * <li>PushDownAttributePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() {
    if (INSTANCE == null) {
        INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() {
    querySpecifications.add(RenamePackagePrecondition.instance());
    querySpecifications.add(RenamePackagePostcondition.instance());
    querySpecifications.add(RenameURIPackagePrecondition.instance());
    querySpecifications.add(RenameURIPackagePostcondition.instance());
    querySpecifications.add(DeletePackagePrecondition.instance());
    querySpecifications.add(DeletePackagePostcondition.instance());
    querySpecifications.add(AddPackagePrecondition.instance());
    querySpecifications.add(AddPackagePostcondition.instance());
    querySpecifications.add(AddClassPrecondition.instance());
    querySpecifications.add(AddClassPostcondition.instance());
    querySpecifications.add(RenameClassPrecondition.instance());
    querySpecifications.add(RenameClassPostcondition.instance());
    querySpecifications.add(DeleteClassPrecondition.instance());
    querySpecifications.add(DeleteClassPostcondition.instance());
    querySpecifications.add(ExtractClassPrecondition.instance());
    querySpecifications.add(ExtractClassPostcondition.instance());
    querySpecifications.add(MergeClassesPrecondition.instance());
    querySpecifications.add(MergeClassesPostcondition.instance());
    querySpecifications.add(AddAttributePrecondition.instance());
    querySpecifications.add(AddAttributePostcondition.instance());
    querySpecifications.add(DeleteAttributePrecondition.instance());
    querySpecifications.add(DeleteAttributePostcondition.instance());
    querySpecifications.add(ChangeAttributeTypePrecondition.instance());
    querySpecifications.add(ChangeAttributeTypePostcondition.instance());
    querySpecifications.add(AddReferencePrecondition.instance());
    querySpecifications.add(AddReferencePostcondition.instance());
    querySpecifications.add(DeleteReferencePrecondition.instance());
    querySpecifications.add(DeleteReferencePostcondition.instance());
    querySpecifications.add(MergeReferencesPrecondition.instance());
    querySpecifications.add(MergeReferencesPostcondition.instance());
    querySpecifications.add(ChangeReferenceTypePrecondition.instance());
    querySpecifications.add(ChangeReferenceTypePostcondition.instance());
    querySpecifications.add(ExtractSuperclassPrecondition.instance());
    querySpecifications.add(ExtractSuperclassPostcondition.instance());
    querySpecifications.add(ChangeClassAbstractPrecondition.instance());
    querySpecifications.add(ChangeClassAbstractPostcondition.instance());
    querySpecifications.add(RestrictReferencePrecondition.instance());
    querySpecifications.add(RestrictReferencePostcondition.instance());
    querySpecifications.add(PushDownAttributePrecondition.instance());
    querySpecifications.add(PushDownAttributePostcondition.instance());
  }
  
  public RenamePackagePrecondition getRenamePackagePrecondition() {
    return RenamePackagePrecondition.instance();
  }
  
  public RenamePackagePrecondition.Matcher getRenamePackagePrecondition(final ViatraQueryEngine engine) {
    return RenamePackagePrecondition.Matcher.on(engine);
  }
  
  public RenamePackagePostcondition getRenamePackagePostcondition() {
    return RenamePackagePostcondition.instance();
  }
  
  public RenamePackagePostcondition.Matcher getRenamePackagePostcondition(final ViatraQueryEngine engine) {
    return RenamePackagePostcondition.Matcher.on(engine);
  }
  
  public RenameURIPackagePrecondition getRenameURIPackagePrecondition() {
    return RenameURIPackagePrecondition.instance();
  }
  
  public RenameURIPackagePrecondition.Matcher getRenameURIPackagePrecondition(final ViatraQueryEngine engine) {
    return RenameURIPackagePrecondition.Matcher.on(engine);
  }
  
  public RenameURIPackagePostcondition getRenameURIPackagePostcondition() {
    return RenameURIPackagePostcondition.instance();
  }
  
  public RenameURIPackagePostcondition.Matcher getRenameURIPackagePostcondition(final ViatraQueryEngine engine) {
    return RenameURIPackagePostcondition.Matcher.on(engine);
  }
  
  public DeletePackagePrecondition getDeletePackagePrecondition() {
    return DeletePackagePrecondition.instance();
  }
  
  public DeletePackagePrecondition.Matcher getDeletePackagePrecondition(final ViatraQueryEngine engine) {
    return DeletePackagePrecondition.Matcher.on(engine);
  }
  
  public DeletePackagePostcondition getDeletePackagePostcondition() {
    return DeletePackagePostcondition.instance();
  }
  
  public DeletePackagePostcondition.Matcher getDeletePackagePostcondition(final ViatraQueryEngine engine) {
    return DeletePackagePostcondition.Matcher.on(engine);
  }
  
  public AddPackagePrecondition getAddPackagePrecondition() {
    return AddPackagePrecondition.instance();
  }
  
  public AddPackagePrecondition.Matcher getAddPackagePrecondition(final ViatraQueryEngine engine) {
    return AddPackagePrecondition.Matcher.on(engine);
  }
  
  public AddPackagePostcondition getAddPackagePostcondition() {
    return AddPackagePostcondition.instance();
  }
  
  public AddPackagePostcondition.Matcher getAddPackagePostcondition(final ViatraQueryEngine engine) {
    return AddPackagePostcondition.Matcher.on(engine);
  }
  
  public AddClassPrecondition getAddClassPrecondition() {
    return AddClassPrecondition.instance();
  }
  
  public AddClassPrecondition.Matcher getAddClassPrecondition(final ViatraQueryEngine engine) {
    return AddClassPrecondition.Matcher.on(engine);
  }
  
  public AddClassPostcondition getAddClassPostcondition() {
    return AddClassPostcondition.instance();
  }
  
  public AddClassPostcondition.Matcher getAddClassPostcondition(final ViatraQueryEngine engine) {
    return AddClassPostcondition.Matcher.on(engine);
  }
  
  public RenameClassPrecondition getRenameClassPrecondition() {
    return RenameClassPrecondition.instance();
  }
  
  public RenameClassPrecondition.Matcher getRenameClassPrecondition(final ViatraQueryEngine engine) {
    return RenameClassPrecondition.Matcher.on(engine);
  }
  
  public RenameClassPostcondition getRenameClassPostcondition() {
    return RenameClassPostcondition.instance();
  }
  
  public RenameClassPostcondition.Matcher getRenameClassPostcondition(final ViatraQueryEngine engine) {
    return RenameClassPostcondition.Matcher.on(engine);
  }
  
  public DeleteClassPrecondition getDeleteClassPrecondition() {
    return DeleteClassPrecondition.instance();
  }
  
  public DeleteClassPrecondition.Matcher getDeleteClassPrecondition(final ViatraQueryEngine engine) {
    return DeleteClassPrecondition.Matcher.on(engine);
  }
  
  public DeleteClassPostcondition getDeleteClassPostcondition() {
    return DeleteClassPostcondition.instance();
  }
  
  public DeleteClassPostcondition.Matcher getDeleteClassPostcondition(final ViatraQueryEngine engine) {
    return DeleteClassPostcondition.Matcher.on(engine);
  }
  
  public ExtractClassPrecondition getExtractClassPrecondition() {
    return ExtractClassPrecondition.instance();
  }
  
  public ExtractClassPrecondition.Matcher getExtractClassPrecondition(final ViatraQueryEngine engine) {
    return ExtractClassPrecondition.Matcher.on(engine);
  }
  
  public ExtractClassPostcondition getExtractClassPostcondition() {
    return ExtractClassPostcondition.instance();
  }
  
  public ExtractClassPostcondition.Matcher getExtractClassPostcondition(final ViatraQueryEngine engine) {
    return ExtractClassPostcondition.Matcher.on(engine);
  }
  
  public MergeClassesPrecondition getMergeClassesPrecondition() {
    return MergeClassesPrecondition.instance();
  }
  
  public MergeClassesPrecondition.Matcher getMergeClassesPrecondition(final ViatraQueryEngine engine) {
    return MergeClassesPrecondition.Matcher.on(engine);
  }
  
  public MergeClassesPostcondition getMergeClassesPostcondition() {
    return MergeClassesPostcondition.instance();
  }
  
  public MergeClassesPostcondition.Matcher getMergeClassesPostcondition(final ViatraQueryEngine engine) {
    return MergeClassesPostcondition.Matcher.on(engine);
  }
  
  public AddAttributePrecondition getAddAttributePrecondition() {
    return AddAttributePrecondition.instance();
  }
  
  public AddAttributePrecondition.Matcher getAddAttributePrecondition(final ViatraQueryEngine engine) {
    return AddAttributePrecondition.Matcher.on(engine);
  }
  
  public AddAttributePostcondition getAddAttributePostcondition() {
    return AddAttributePostcondition.instance();
  }
  
  public AddAttributePostcondition.Matcher getAddAttributePostcondition(final ViatraQueryEngine engine) {
    return AddAttributePostcondition.Matcher.on(engine);
  }
  
  public DeleteAttributePrecondition getDeleteAttributePrecondition() {
    return DeleteAttributePrecondition.instance();
  }
  
  public DeleteAttributePrecondition.Matcher getDeleteAttributePrecondition(final ViatraQueryEngine engine) {
    return DeleteAttributePrecondition.Matcher.on(engine);
  }
  
  public DeleteAttributePostcondition getDeleteAttributePostcondition() {
    return DeleteAttributePostcondition.instance();
  }
  
  public DeleteAttributePostcondition.Matcher getDeleteAttributePostcondition(final ViatraQueryEngine engine) {
    return DeleteAttributePostcondition.Matcher.on(engine);
  }
  
  public ChangeAttributeTypePrecondition getChangeAttributeTypePrecondition() {
    return ChangeAttributeTypePrecondition.instance();
  }
  
  public ChangeAttributeTypePrecondition.Matcher getChangeAttributeTypePrecondition(final ViatraQueryEngine engine) {
    return ChangeAttributeTypePrecondition.Matcher.on(engine);
  }
  
  public ChangeAttributeTypePostcondition getChangeAttributeTypePostcondition() {
    return ChangeAttributeTypePostcondition.instance();
  }
  
  public ChangeAttributeTypePostcondition.Matcher getChangeAttributeTypePostcondition(final ViatraQueryEngine engine) {
    return ChangeAttributeTypePostcondition.Matcher.on(engine);
  }
  
  public AddReferencePrecondition getAddReferencePrecondition() {
    return AddReferencePrecondition.instance();
  }
  
  public AddReferencePrecondition.Matcher getAddReferencePrecondition(final ViatraQueryEngine engine) {
    return AddReferencePrecondition.Matcher.on(engine);
  }
  
  public AddReferencePostcondition getAddReferencePostcondition() {
    return AddReferencePostcondition.instance();
  }
  
  public AddReferencePostcondition.Matcher getAddReferencePostcondition(final ViatraQueryEngine engine) {
    return AddReferencePostcondition.Matcher.on(engine);
  }
  
  public DeleteReferencePrecondition getDeleteReferencePrecondition() {
    return DeleteReferencePrecondition.instance();
  }
  
  public DeleteReferencePrecondition.Matcher getDeleteReferencePrecondition(final ViatraQueryEngine engine) {
    return DeleteReferencePrecondition.Matcher.on(engine);
  }
  
  public DeleteReferencePostcondition getDeleteReferencePostcondition() {
    return DeleteReferencePostcondition.instance();
  }
  
  public DeleteReferencePostcondition.Matcher getDeleteReferencePostcondition(final ViatraQueryEngine engine) {
    return DeleteReferencePostcondition.Matcher.on(engine);
  }
  
  public MergeReferencesPrecondition getMergeReferencesPrecondition() {
    return MergeReferencesPrecondition.instance();
  }
  
  public MergeReferencesPrecondition.Matcher getMergeReferencesPrecondition(final ViatraQueryEngine engine) {
    return MergeReferencesPrecondition.Matcher.on(engine);
  }
  
  public MergeReferencesPostcondition getMergeReferencesPostcondition() {
    return MergeReferencesPostcondition.instance();
  }
  
  public MergeReferencesPostcondition.Matcher getMergeReferencesPostcondition(final ViatraQueryEngine engine) {
    return MergeReferencesPostcondition.Matcher.on(engine);
  }
  
  public ChangeReferenceTypePrecondition getChangeReferenceTypePrecondition() {
    return ChangeReferenceTypePrecondition.instance();
  }
  
  public ChangeReferenceTypePrecondition.Matcher getChangeReferenceTypePrecondition(final ViatraQueryEngine engine) {
    return ChangeReferenceTypePrecondition.Matcher.on(engine);
  }
  
  public ChangeReferenceTypePostcondition getChangeReferenceTypePostcondition() {
    return ChangeReferenceTypePostcondition.instance();
  }
  
  public ChangeReferenceTypePostcondition.Matcher getChangeReferenceTypePostcondition(final ViatraQueryEngine engine) {
    return ChangeReferenceTypePostcondition.Matcher.on(engine);
  }
  
  public ExtractSuperclassPrecondition getExtractSuperclassPrecondition() {
    return ExtractSuperclassPrecondition.instance();
  }
  
  public ExtractSuperclassPrecondition.Matcher getExtractSuperclassPrecondition(final ViatraQueryEngine engine) {
    return ExtractSuperclassPrecondition.Matcher.on(engine);
  }
  
  public ExtractSuperclassPostcondition getExtractSuperclassPostcondition() {
    return ExtractSuperclassPostcondition.instance();
  }
  
  public ExtractSuperclassPostcondition.Matcher getExtractSuperclassPostcondition(final ViatraQueryEngine engine) {
    return ExtractSuperclassPostcondition.Matcher.on(engine);
  }
  
  public ChangeClassAbstractPrecondition getChangeClassAbstractPrecondition() {
    return ChangeClassAbstractPrecondition.instance();
  }
  
  public ChangeClassAbstractPrecondition.Matcher getChangeClassAbstractPrecondition(final ViatraQueryEngine engine) {
    return ChangeClassAbstractPrecondition.Matcher.on(engine);
  }
  
  public ChangeClassAbstractPostcondition getChangeClassAbstractPostcondition() {
    return ChangeClassAbstractPostcondition.instance();
  }
  
  public ChangeClassAbstractPostcondition.Matcher getChangeClassAbstractPostcondition(final ViatraQueryEngine engine) {
    return ChangeClassAbstractPostcondition.Matcher.on(engine);
  }
  
  public RestrictReferencePrecondition getRestrictReferencePrecondition() {
    return RestrictReferencePrecondition.instance();
  }
  
  public RestrictReferencePrecondition.Matcher getRestrictReferencePrecondition(final ViatraQueryEngine engine) {
    return RestrictReferencePrecondition.Matcher.on(engine);
  }
  
  public RestrictReferencePostcondition getRestrictReferencePostcondition() {
    return RestrictReferencePostcondition.instance();
  }
  
  public RestrictReferencePostcondition.Matcher getRestrictReferencePostcondition(final ViatraQueryEngine engine) {
    return RestrictReferencePostcondition.Matcher.on(engine);
  }
  
  public PushDownAttributePrecondition getPushDownAttributePrecondition() {
    return PushDownAttributePrecondition.instance();
  }
  
  public PushDownAttributePrecondition.Matcher getPushDownAttributePrecondition(final ViatraQueryEngine engine) {
    return PushDownAttributePrecondition.Matcher.on(engine);
  }
  
  public PushDownAttributePostcondition getPushDownAttributePostcondition() {
    return PushDownAttributePostcondition.instance();
  }
  
  public PushDownAttributePostcondition.Matcher getPushDownAttributePostcondition(final ViatraQueryEngine engine) {
    return PushDownAttributePostcondition.Matcher.on(engine);
  }
}
