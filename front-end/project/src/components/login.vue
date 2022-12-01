<template>
    <div>
        <h2>登录界面</h2>
        <form class="special">
        账号：<input type = "text" v-model= "username"><br>
        密码：<input type = "password" v-model = "password"><br>
       <el-button @click ="login()">登录</el-button>
        </form>
    </div>
</template>
<script>
//  import { userLogin } from '../../api/api';
  export default {
    data() {
      return {
        username: '',
        password: '',
        identify:''
      }
    },
    watch: {
	'$route' (to, from) {
    // 路由发生变化页面刷新
	this.$router.go(0);
		}
},

    methods: {
        reg(){
           this.$router.push('/reg')
        },
      //提示未输入账户或密码
      login() {
  /*      this.$router.push({
          path:'/APP',
          query:{
            identify:this.identify
          }
        })*/
        if (!this.username) {
          alert("请输入用户名");
          return;
        }
        if (!this.password) {
          alert("请输入密码");
          return;
        }
         const _this = this;
         if(_this.username == "admin" && _this.password == "admin"){
           _this.$alert('登陆成功',{
                        confirmButtonText:'确定',
                        callback: action =>{
  //保存登录数据在浏览器   
                          var jsonStr = JSON.stringify(_this.username);
                          sessionStorage.setItem(_this.username, jsonStr);
                          _this.$router.push('/bedInfo')
                        }
            })
         }
       /* this.$axios.get('http://localhost:8181/'+this.identify+'/login/'+this.username+'/'+this.password).then(function (resp) {
        if (resp.data != "" ) {
           _this.$alert('登陆成功',{
                        confirmButtonText:'确定',
                        callback: action =>{
  //保存登录数据在浏览器   
                          var jsonStr = JSON.stringify(resp);
                          sessionStorage.setItem(resp, jsonStr);
                             if (_this.identify == 'masters') {
                             _this.$router.push('/manager')
                             }else if (_this.identify == 'customers') {
                             _this.$router.push('/customer')
                             } else if (_this.identify == 'windows') {
                             _this.$router.push('/clerk')
                             }
                              _this.$router.push('/Home');
                        }
             })
          }*/
          else{
             _this.$alert('登陆失败');
          }
         console.log(this.username + this.password + this.identify)
    }
  }
}
</script>
<style scoped>
input, select {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  border: 1px solid #ccc;
  border-radius: 4px;  
  box-sizing: border-box;
}
input[type=submit] {
  width: 20%;
  background-color: #4c7faf;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #3e6285;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  opacity: 80%;
  padding: 20px;
}
.special{
  opacity: 100%;
}
</style>