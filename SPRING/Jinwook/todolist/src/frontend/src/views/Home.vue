<template>
    <v-app>
      <v-layout row wrap >
        <v-flex xs6>
          <List></List>
        </v-flex >
        <v-flex xs6>
          <ListAdd></ListAdd>
        </v-flex>
      </v-layout>
    </v-app>
</template>

<script>
import List from "@/components/List"
import ListAdd from "@/components/ListAdd"
export default {
  name: 'Home',
  components: {
    List,
    ListAdd
  }
}
</script>
