/*
 * Copyright 2011 Robert Theis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dyslexia.ocr;

import java.util.List;

import android.graphics.Point;
import android.graphics.Rect;
import com.dyslexia.ocr.R;

/**
 * Encapsulates text and its character/word coordinates resulting from OCR.
 */
public final class OcrResultText {
  private final String text;
  
  private final int[] wordConfidences;
  private final int meanConfidence;
  private final Point bitmapDimensions;
  private final List<Rect> wordBoundingBoxes;
  private final List<Rect> characterBoundingBoxes;
  private final List<Rect> textlineBoundingBoxes;
  private final List<Rect> regionBoundingBoxes;
  
  public OcrResultText(String text,
                   int[] wordConfidences,
                   int meanConfidence,
                   Point bitmapDimensions,
                   List<Rect> characterBoundingBoxes,
                   List<Rect> wordBoundingBoxes,
                   List<Rect> textlineBoundingBoxes,
                   List<Rect> regionBoundingBoxes) {
    this.text = text;
    this.wordConfidences = wordConfidences;
    this.meanConfidence = meanConfidence;
    this.bitmapDimensions = bitmapDimensions;
    this.characterBoundingBoxes = characterBoundingBoxes;
    this.wordBoundingBoxes = wordBoundingBoxes;
    this.textlineBoundingBoxes = textlineBoundingBoxes;
    this.regionBoundingBoxes = regionBoundingBoxes;
  }

  public String getText() {
    return text;
  }

  public Point getBitmapDimensions() {
    return bitmapDimensions;
  }
  
  public int[] getWordConfidences() {
    return wordConfidences;
  }

  public int getMeanConfidence() {
    return meanConfidence;
  }

  public List<Rect> getCharacterBoundingBoxes() {
    return characterBoundingBoxes;
  }
  
  public List<Rect> getTextlineBoundingBoxes() {
    return textlineBoundingBoxes;
  }
  
  public List<Rect> getWordBoundingBoxes() {
    return wordBoundingBoxes;
  }
  
  public List<Rect> getRegionBoundingBoxes() {
    return regionBoundingBoxes;
  }
  
  @Override
  public String toString() {
    return text + " " + meanConfidence;
  }
}