const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm75fch/",
            name: "ssm75fch",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm75fch/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "乐室预约"
        } 
    }
}
export default base
