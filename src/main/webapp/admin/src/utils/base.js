const base = {
    get() {
                return {
            url : "http://localhost:8080/xianhuaxiaoshou/",
            name: "xianhuaxiaoshou",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xianhuaxiaoshou/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "鲜花销售系统"
        } 
    }
}
export default base
