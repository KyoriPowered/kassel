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
package net.kyori.kassel.channel.message;

import java.util.List;
import java.util.stream.Stream;
import net.kyori.kassel.channel.message.embed.Embed;
import net.kyori.kassel.channel.message.emoji.Emoji;
import net.kyori.kassel.guild.role.Role;
import net.kyori.kassel.snowflake.Snowflaked;
import net.kyori.kassel.user.User;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * A message.
 */
public interface Message extends Snowflaked {
  /**
   * The maximum length of a message.
   */
  int MAXIMUM_LENGTH = 2000;

  /**
   * Gets the author.
   *
   * @return the author
   */
  @NonNull User author();

  /**
   * Gets the content.
   *
   * @return the content
   */
  @NonNull String content();

  /**
   * Gets the embeds.
   *
   * @return the embeds
   */
  @NonNull List<Embed> embeds();

  /**
   * Gets a stream of the mentioned users.
   *
   * @return a stream of the mentioned users
   */
  @NonNull Stream<User> mentionedUsers();

  /**
   * Gets a stream of the mentioned roles.
   *
   * @return a stream of the mentioned roles
   */
  @NonNull Stream<Role> mentionedRoles();

  /**
   * Gets the reactions.
   *
   * @return the reactions
   */
  @NonNull Reactions reactions();

  /**
   * Edits this message.
   *
   * @param edit the edit
   */
  void edit(final @NonNull Edit edit);

  /**
   * Deletes this message.
   */
  void delete();

  /**
   * An edit.
   */
  interface Edit extends MessagePartial {
    /**
     * A full edit.
     */
    interface Full extends MessagePartial.ContentPartial, MessagePartial.EmbedPartial {
    }
  }

  /**
   * The reactions.
   */
  interface Reactions {
    /**
     * Adds a reaction.
     *
     * @param emoji the emoji
     */
    void add(final @NonNull Emoji emoji);

    /**
     * Removes a reaction.
     *
     * @param emoji the emoji
     */
    void remove(final @NonNull Emoji emoji);

    /**
     * Removes a reaction.
     *
     * @param user the user
     * @param emoji the emoji
     */
    void remove(final @NonNull User user,  final @NonNull Emoji emoji);

    /**
     * Removes all reactions.
     */
    void removeAll();
  }
}
