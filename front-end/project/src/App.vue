
<template>
  <div id="app">
    <div class="header">
    </div>
    <h1>Neusoft东软颐养中心</h1>
    <router-view
    router-view/>
  </div>
</template>

<script>
export default {
  name: 'App',
}
</script>

<style >
#app {
  font-family:Verdana, Geneva, Tahoma, sans-serif;
  text-align: center;
  color: rgb(47, 61, 61);
  background: url('~@/assets/background.jpg');
  height: 1500px;
}
.header{
  background-color:white;
  height: 50px;
  width: 100%;
  opacity: 0%;
}
.nav{
  color: white;;
  text-decoration-line: none;
  line-height: 50px;
  text-align: center;
  width:30%;
  padding:20px 20px;
}
.nav:hover{
  color: cadetblue;
  background-color: lightblue;
}
.card{
  width: 100%;
  height: 100%;
}
</style>
<script>
export default {
  data(){
    return{
      msg:'登录'
    }
  }
}
</script>
