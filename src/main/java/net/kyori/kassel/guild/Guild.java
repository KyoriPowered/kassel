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
package net.kyori.kassel.guild;

import java.util.stream.Stream;
import net.kyori.kassel.Named;
import net.kyori.kassel.channel.Channel;
import net.kyori.kassel.channel.message.emoji.CustomEmoji;
import net.kyori.kassel.guild.member.Member;
import net.kyori.kassel.guild.role.Role;
import net.kyori.kassel.snowflake.Snowflake;
import net.kyori.kassel.snowflake.Snowflaked;
import net.kyori.mu.Maybe;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * A guild.
 */
public interface Guild extends Named, Snowflaked {
  /**
   * Gets a stream of all channels.
   *
   * @return a stream of all channels
   */
  @NonNull Stream<Channel> channels();

  /**
   * Gets a channel by its snowflake id.
   *
   * @param id the snowflake id
   * @return the channel
   */
  @NonNull Maybe<Channel> channel(final @Snowflake long id);

  /**
   * Gets a stream of all emojis.
   *
   * @return a stream of all emojis
   */
  @NonNull Stream<CustomEmoji> emojis();

  /**
   * Gets an emoji by its snowflake id.
   *
   * @param id the snowflake id
   * @return the emoji
   */
  @NonNull Maybe<CustomEmoji> emoji(final @Snowflake long id);

  /**
   * Gets a member by their snowflake id.
   *
   * @param id the snowflake id
   * @return the member
   */
  @NonNull Maybe<Member> member(final @Snowflake long id);

  /**
   * Gets a stream of all roles.
   *
   * @return a stream of all roles
   */
  @NonNull Stream<Role> roles();

  /**
   * Gets a role by its snowflake id.
   *
   * @param id the snowflake id
   * @return the role
   */
  @NonNull Maybe<Role> role(final @Snowflake long id);
}
