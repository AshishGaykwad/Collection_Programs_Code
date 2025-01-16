package Tree;
public class Mytree {
	Node root;
	public void add(int num) {
		Node newObj = new Node();
		newObj.num = num;

		if (root == null)
			root = newObj;
		else {
			Node prachi = root;
			while (true) {
				if (num < prachi.num) {
					if (prachi.right == null) {
						prachi.right = newObj;
						break;
					}

					else {
						prachi = prachi.right;
					}

				} else if (num == prachi.num) {
					break;
				} else {
					if (prachi.left == null) {
						prachi.left = newObj;
						break;
					}

					else {
						prachi = prachi.left;
					}

				}

			}

		}

	}

	public void print() {
		myprint(root);
	}

	private void myprint(Node n) {
		if (n.right != null) {
			myprint(n.right);
		}
		System.out.println(n.num);

		if (n.left != null) {
			myprint(n.left);
		}

	}

}
