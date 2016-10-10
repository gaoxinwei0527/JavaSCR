package OBJ03J;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */

@SuppressWarnings("unchecked")

public class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
    
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(1);

		// Java 7 Type Inference
		Box<Integer> intBox = new Box<>();  
		intBox.set(2);
		
		// If the actual type argument is omitted, a raw type of Box<T> is created:
		Box rawBox = new Box();
		
		// For backward compatibility, assigning a parameterized type to its raw type is allowed:
		Box<String> stringBox = new Box<>();
		rawBox = stringBox;               // OK
		rawBox.set(8);  // warning: unchecked invocation to set(T)

		// Assigning a raw type to a parameterized type, creates a warning:
		rawBox = new Box();  // rawBox is a raw type of Box<T>
		intBox = rawBox;     // warning: unchecked conversion
		
		List list = new ArrayList();
		List<String> ls = list;   // warning: unchecked conversion
		
		if (intBox.getClass() == stringBox.getClass()) {
			System.out.println("intBox.getClass() == stringBox.getClass()");
		}
	}
    
}