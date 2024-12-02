package org.example;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicate {
    public boolean hasDuplicates(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return false; // No duplicates if the list is null or empty
        }

        Set<String> uniqueStrings = new HashSet<>(strings);
        return uniqueStrings.size() != strings.size();
    }
}
