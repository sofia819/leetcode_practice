/**
 * 797. All Paths From Source to Target
 * https://leetcode.com/problems/all-paths-from-source-to-target/
 * https://leetcode.com/problems/all-paths-from-source-to-target/discuss/380900/JavaScript-DFS-Solution
 */

 /**
 * @param {number[][]} graph
 * @return {number[][]}
 */
var allPathsSourceTarget = function(graph) {
    const ans = []
    const path = []
    
    const dfs = currentNode => {
        // Reached the destination
        if(currentNode === graph.length - 1) {
            // Add a copy of the path to ans
            ans.push(path.slice(0))
        }
        else {
            graph[currentNode].forEach(
                node => {
                    // Add the current node to the path
                    path.push(node)
                    // With the new path and node, find the next new path
                    dfs(node, path)
                    // Remove the node that just got added to the path so it does not affect the next path
                    path.pop()
                }
            )
        }
    }
    
    // Add the starting point to the path
    path.push(0)
    dfs(0)
    
    return ans
}
