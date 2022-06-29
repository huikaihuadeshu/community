package com.newcoder.community.entity;
//分页相关信息
public class Page {
//    当前页码
    private int current = 1;
//    每页显示上限
    private int limit = 10;
//    数据总数：用来计算总页数
    private  int rows;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0){
            this.rows = rows;
        }

    }

    //    查询路径
    private String path;


    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current >= 1){
            this.current = current;
        }

    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >=1 && limit <= 100){
            this.limit = limit;
        }

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public int getOffset(){
        return (current - 1) * limit;
    }
    public int getTotal(){
        if(rows % limit == 0){
            return rows / limit;
        }else{
            return rows / limit + 1;
        }
    }

    public int getFrom(){
        int form = current - 2;
        return  form < 1 ? 1 : form;
    }
    public  int getTo(){
        int to = current + 2;
        int total = getTotal();
        return to > total ? total : to;

    }

}
