// This is a generated file. Not intended for manual editing.
package io.teocloud.teointellijidea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TeoEnumDefinition extends PsiElement {

  @NotNull
  List<TeoWs> getWsList();

  @Nullable
  TeoDocCommentBlock getDocCommentBlock();

  @NotNull
  TeoEnumDefinitionBlock getEnumDefinitionBlock();

  @NotNull
  TeoEnumName getEnumName();

  @Nullable
  TeoItemDecoratorList getItemDecoratorList();

}
