func allZero(m map[rune]int) bool {
    for _, count := range m {
        if count != 0 {
            return false
        }
    }
    return true
}

func isAnagram(s string, t string) bool {
    if len(s) != len(t) {
        return false
    }
    m := make(map[rune]int)
    for _, c := range s {
        m[c]++
    }
    for _, c := range t {
        m[c]--
    }
    return allZero(m)
}
