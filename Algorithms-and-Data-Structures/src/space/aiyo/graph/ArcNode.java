package space.aiyo.graph;
/**
 * 
 * 边或弧的结点
 * @author Yo
 * */
public class ArcNode {
	/**
	 * 邻接点域 指示与顶点vi邻接的点在图中的编号
	 * */
	private int adjvex;
	/**
	 * 指示下一条边或弧的结点
	 * */
	private ArcNode nextArc;
	/**
	 * 和弧有关的其他信息
	 * */
	private Object info;
	
	
	
	
	public int getAdjvex() {
		return adjvex;
	}
	public void setAdjvex(int adjvex) {
		this.adjvex = adjvex;
	}
	public ArcNode getNextArc() {
		return nextArc;
	}
	public void setNextArc(ArcNode nextArc) {
		this.nextArc = nextArc;
	}
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}
}
