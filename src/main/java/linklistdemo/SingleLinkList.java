package linklistdemo;

/**
 * Created by liuBo on 2018/3/28.
 */
public class SingleLinkList {

    private static Date first = null;

    private class Date{
        private Object obj;
        private Date next;

        public Date(Object obj){
            this.obj = obj;
        }
    }

    /**
     * 添加节点
     */
    private void insertLinkList(Object obj){
        Date date = new Date(obj);
        date.next = first;
        first = date;
    }

    public boolean isEmpty(){
        return (null == first);
    }
    /**
     * 遍历展示所有节点
     */
    private void display(){
        if(null == first)
            System.out.println("empty");
        Date cur = first;
        while (null != cur){
            System.out.print(cur.obj+" -> ");
            cur = cur.next;
        }
        System.out.println("\n");
    }

    private Object find(Object obj){
        if(null == first)
            return null;
        Date cur = first;
        while (null != cur){
            if(cur.obj.equals(obj)){
                return cur.obj;
            }
            cur = cur.next;
        }
        return null;
    }

    private void remove(Object obj){
        if(null == first)
            System.out.println("empty linkList");
        if(first.obj.equals(obj)){
            first = first.next;
        }else{
            Date pre = first;
            Date cur = first.next;

            while (null != cur){
                if(cur.obj.equals(obj))
                    pre.next = cur.next;

                pre = cur;
                cur = cur.next;
            }
        }

    }

    public static void main(String[] args){
        SingleLinkList linkList = new SingleLinkList();
        linkList.insertLinkList(1);
        linkList.insertLinkList(2);
        linkList.insertLinkList(3);
        linkList.insertLinkList(4);
        linkList.display();
        linkList.remove(2);
        linkList.display();
        System.out.println(linkList.find(3));
        System.out.println(linkList.isEmpty());
    }
}
