package com.example.krishnaverse.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.krishnaverse.viewmodel.ChatViewModel

@Composable
fun ChatScreen(
    modifier: Modifier = Modifier
) {
    val vm: ChatViewModel = viewModel()
    val listState = rememberLazyListState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .imePadding()
    ) {
        LazyColumn(
            state = listState,  // this will scroll to the bottom of the list when a new message is added
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(vm.messages) { msg ->
                AnimatedMessage {
                    if (msg.first) {
                        UserBubble(msg.second)
                    } else {
                        KrishnaBubble(msg.second)
                    }
                }
            }
        }

        LaunchedEffect(vm.messages.size) {
            if (vm.messages.isNotEmpty()) {
                listState.animateScrollToItem(
                    index = vm.messages.lastIndex
                )
            }
        }
        MessageInput { vm.sendMessage(it) }
    }
}

