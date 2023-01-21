// This is a generated file. Not intended for manual editing.
package io.teocloud.teointellijidea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.teocloud.teointellijidea.psi.TeoTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.teocloud.teointellijidea.psi.*;

public class TeoModelDefinitionBlockImpl extends ASTWrapperPsiElement implements TeoModelDefinitionBlock {

  public TeoModelDefinitionBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TeoVisitor visitor) {
    visitor.visitModelDefinitionBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TeoVisitor) accept((TeoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TeoWs> getWsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TeoWs.class);
  }

  @Override
  @NotNull
  public List<TeoBlockDecorator> getBlockDecoratorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TeoBlockDecorator.class);
  }

  @Override
  @NotNull
  public List<TeoComment> getCommentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TeoComment.class);
  }

  @Override
  @NotNull
  public List<TeoFieldDefinition> getFieldDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TeoFieldDefinition.class);
  }

}
