package XMLandJSON.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Convertor = 0;
  public static final int JSON = 1;
  public static final int JSONAttribute = 2;
  public static final int JSONElement = 3;
  public static final int JSONField = 4;
  public static final int XML = 5;
  public static final int XMLAttribute = 6;
  public static final int XMLElement = 7;
  public static final int XMLField = 8;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x5340cbbc1593490dL, 0xa1b08191311313d1L);
    builder.put(0x587e888911637068L, Convertor);
    builder.put(0x3605bc724f561142L, JSON);
    builder.put(0x3605bc724f563980L, JSONAttribute);
    builder.put(0x3605bc724f56397fL, JSONElement);
    builder.put(0x3605bc724f563985L, JSONField);
    builder.put(0x3605bc724f528793L, XML);
    builder.put(0x3605bc724f528794L, XMLAttribute);
    builder.put(0x3605bc724f528795L, XMLElement);
    builder.put(0x3605bc724f54bc13L, XMLField);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
