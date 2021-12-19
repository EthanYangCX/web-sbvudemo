<template>
  <div>
<!--    head-->
    <Header></Header>

<!--    main body-->
    <div style="display:flex">
<!--      side bar-->
      <Aside/>
<!--      content-->
      <router-view style="flex: 1"/>
    </div>
  </div>

</template>

<style>

</style>

<script>
import Header from "@/components/Header";
import Aside from "@/components/Aside";

export default {
  name: "layout",
  components: {
    Aside,
    Header
  }
}
</script>