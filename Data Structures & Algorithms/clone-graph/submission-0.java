

class Solution {
    Map<Node, Node> visited = new HashMap<>();
    public Node cloneGraph(Node node) {

        if(node == null) {
            return node;
        }

        if(visited.containsKey(node)) {
            return visited.get(node);
        }

        Node newNode = new Node(node.val, new ArrayList<Node>());
        visited.put(node, newNode);

        for(Node neibhour: node.neighbors) {
            newNode.neighbors.add(cloneGraph(neibhour));
        }

        return newNode;
        
    }
}