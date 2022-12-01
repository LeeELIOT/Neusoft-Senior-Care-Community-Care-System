<template>
    <div >
<el-card class="box-card">
 
  <div v-for="item in beds" :key="item" class="text item" style="float:left; width:300px; padding:20px; box-shadow: 12px 12px 12px rgba(0,0,0,0.1)">  
        <div v-for="i in item" :key="i" class="text item" style="float:left; margin-left:50px;">
           <img v-if="i == '占用'" src="../../assets/beded.png" style="width:50px;">
           <img v-if="i == '空闲'" src="../../assets/freebed.png" style="width:50px;">
           <img v-if="i == '预留'" src="../../assets/reservebed.png" style="width:50px;">    
         {{i}}
        </div>
  </div>
</el-card>
</div>
</template>
<script>

export default{
     created(){
        const _this = this
             _this.$axios.post('http://47.93.118.35:8888/old/bed/getAllBeds?blockName=南研楼&floor=3').then(function(resp){
             _this.beds = resp.data.bedByRoom
             var string = JSON.stringify(_this.beds[1])
             console.log(string)
                 })
                
        },
        data:{
            showFlag:false
        },
        data() { 
            return{
                /*beds:[{status:"占用"},{status:'空闲'},{status:'预留'},{status:'空闲'},{status:'预留'},{status:'预留'},{status:'占用'}]*/
                beds:[],
                
            }
        },
        methods:{

        }
 }
</script>
<style scoped>
.text {
    font-size: 14px;
  }

  .item {
    margin-bottom: 18px;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }
  .clearfix:after {
    clear: both
  }

  .box-card {
    width: 100%px;
  }
</style>