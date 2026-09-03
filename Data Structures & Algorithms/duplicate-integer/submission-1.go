func hasDuplicate(nums []int) bool {
    seen := make(map[int]bool)
    for _, val := range nums {
        if seen[val] {
            return true;
        }
        seen[val] = true
    }
    return false
}
