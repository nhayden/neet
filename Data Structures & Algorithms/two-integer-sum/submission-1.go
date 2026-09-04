func twoSum(nums []int, target int) []int {
    m := make(map[int]int)
    for i, val := range nums {
        idx, ok := m[val]
        if ok {
            return []int{idx, i}
        } else {
            m[target - val] = i
        }
    }
    return nil
}
