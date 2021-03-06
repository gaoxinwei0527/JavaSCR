// The MIT License (MIT)
// 
// Copyright (c) 2016 Robert C. Seacord
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.

package MET08J;

final class caseInsensitiveStringGood {
  private String s;
 
  private caseInsensitiveStringGood(String s) {
    if (s == null) {
      throw new NullPointerException();
    }
    this.s = s;
  }
 
  // Simplified to operate only on instances of the 
  // CaseInsensitiveString class, consequently preserving symmetry
  @Override
  public boolean equals(Object o) {
    return o instanceof caseInsensitiveStringGood &&
        ((caseInsensitiveStringGood)o).s.equalsIgnoreCase(s);
  }
 
	// Comply with MET09-J
	@Override
  public int hashCode() {
		/* ... */
		return 0;
	}
 
  public static void main(String[] args) {
    caseInsensitiveStringGood cis = new caseInsensitiveStringGood("Java"); //$NON-NLS-1$
    String s = "java"; //$NON-NLS-1$
    System.out.println(cis.equals(s)); // Returns false now
    System.out.println(s.equals(cis)); // Returns false now
  }
}