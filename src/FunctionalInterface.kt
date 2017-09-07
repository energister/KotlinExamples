import com.google.common.base.Predicate
import com.google.common.collect.Iterables

/* functional Java interface (or SAM interface) - an interface with a Single Abstract Method */

/* Java code:
    public boolean task4(Collection<Integer> collection) {
        return Iterables.any(collection, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer element) {
                return element % 2 == 0;
            }
        });
    }
*/

/* Kotlin equivalent */
fun task4(collection: Collection<Int>): Boolean {
    // If the object is an instance of a functional Java interface,
    // you can create it using a lambda expression prefixed with the type of the interface:
    return Iterables.any(collection, Predicate<Int?> { it!! % 2 == 0 })
}

