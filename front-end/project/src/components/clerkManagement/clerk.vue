<template>
<div>
   <el-tabs v-model="activeName" @tab-click="handleClick">
    <el-tab-pane label="早餐" name="first"><nurse></nurse></el-tab-pane>
    <el-tab-pane label="午餐" name="second"><lunch></lunch></el-tab-pane>
    <el-tab-pane label="晚餐" name="third"><diner></diner></el-tab-pane>
  </el-tabs>
</div>
</template>

<script>
import nurse from './nurse.vue'
  export default {
      components:{
      nurse,

    },
            
    methods: {
      
    },
    data() {
      return {
        activeName:"first",
        dishes:[ ],
        id:'',
        name:'',
        picture:'',
        price:'',
        json:{
          taste:{},
        }
      }
    }
  }
</script>
<style type="text/css" scoped>
.all{
    margin-top: -30px;
    word-break: break-all;
    height: 100%;
  }
  .mid{
    margin-top: 25%;
    height: 50%;
  }
  .mid_item{
    justify-content: center;
    align-items: center;
  }
  .item {
    margin-bottom: 10px;
  }
  .item_tag{
    float:left;
    text-align:left;
  }
  .item_desr{
    margin-left: 20%;
    min-height: 20px;
    text-align:left;
  }
  .text {
    width: 100%;
    font-size: 10px;
    font-family: "Microsoft YaHei";
    color: #909399;
  }
  .clearfix:before,
  .clearfix:after {
      display: table;
      content: "";
  }
  
  .clearfix:after {
      clear: both
  }
 
  .el-card {
    min-width: 100%;
    height: 100%;
    margin-right: 20px;
    /*transition: all .5s;*/
  }
  .el-card:hover{
    margin-top: -5px;
  }
  .el-row {
    margin-bottom: 20px;
    display: flex;
    flex-wrap: wrap
  }
  .el-col {
    border-radius: 4px;
    align-items: stretch;
    margin-bottom: 20px;
  }
</style>