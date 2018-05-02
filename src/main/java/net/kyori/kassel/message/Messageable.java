/*
 * This file is part of kassel, licensed under the MIT License.
 *
 * Copyright (c) 2018 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.kassel.message;

import net.kyori.kassel.channel.message.Message;
import net.kyori.kassel.channel.message.embed.Embed;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * Something that can can be messaged.
 */
public interface Messageable {
  /**
   * Sends a message.
   *
   * @param content the message content
   * @return the message
   */
  default @NonNull CompletableFuture<Message> message(final @NonNull String content) {
    return this.message(content, (Embed) null);
  }

  /**
   * Sends a message.
   *
   * @param embed the embed
   * @return the message
   */
  default @NonNull CompletableFuture<Message> message(final Embed.@NonNull Builder embed) {
    return this.message(null, embed);
  }

  /**
   * Sends a message.
   *
   * @param embed the embed
   * @return the message
   */
  default @NonNull CompletableFuture<Message> message(final @NonNull Embed embed) {
    return this.message(null, embed);
  }

  /**
   * Sends a message.
   *
   * @param content the message content
   * @param embed the embed
   * @return the message
   */
  default @NonNull CompletableFuture<Message> message(final @Nullable String content, final Embed.@Nullable Builder embed) {
    return this.message(content, embed != null ? embed.build() : null);
  }

  /**
   * Sends a message.
   *
   * @param content the message content
   * @param embed the embed
   * @return the message
   */
  @NonNull CompletableFuture<Message> message(final @Nullable String content, final @Nullable Embed embed);
}
